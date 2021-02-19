import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class CorVisitor{
	public static class Cor extends ColorsBaseVisitor<String> {
		String erroComb = 
		"except:\n"+
		"	print('Nao foi possivel combinar as cores. Verifique as cores digitadas')";
		
		String erroMost = 
		"except:\n"+
		"	print('Nao foi possivel mostrar essa cor. Verifique a cor digitada')";

		@Override 
		public String visitProg(ColorsParser.ProgContext ctx) { 
			String preProg = "";
			preProg = 
			"from PIL import Image, ImageFilter, ImageColor, ImageDraw, ImageFont\n" +
			"def geraImagem(cor):\n" + 
			"	if(cor == '#EF6111'):\n" + 
      		"		nomeCor = 'Red-Orange'\n" +
   			"	elif(cor == '#C5FC0B'):\n" +
      		"		nomeCor = 'Yellow-Green'\n" +
   			"	elif(cor == '#FCB116'):\n" +
     		"		nomeCor = 'Yellow-Orange'\n" +
   			"	elif(cor == '#AA0A76'):\n" +
      		"		nomeCor = 'Red-Violet'\n" +
   			"	elif(cor == '#3B1B80'):\n" +
      		"		nomeCor = 'Blue-Violet'\n" +
   			"	elif(cor == '#1B4D58'):\n" +
      		"		nomeCor = 'Blue-Green'\n" +
   			"	else:\n" +
      		"		nomeCor = cor\n" +
			"	img = Image.new('RGB', (256, 256), ImageColor.getrgb(cor))\n" + 
			"	img.save(nomeCor+'.jpg','JPEG')\n" +
			"	base = Image.open(nomeCor+'.jpg').convert('RGBA')\n" + 
			"	txt = Image.new('RGBA', base.size, (255,255,255,0))\n" + 
			"	fnt = ImageFont.truetype('stocky.ttf', 40)\n" + 
			"	d = ImageDraw.Draw(txt)\n"+ 
			"	d.text((10,60), nomeCor, font=fnt, fill=(255,255,255,255))\n"+ 
			"	out = Image.alpha_composite(base, txt)\n"+ 
			"	out.save(nomeCor+'.png','PNG')\n"+ 
   			"	imagem = nomeCor + '.png'\n"+ 
			"	im = Image.open(imagem)\n"+ 
			"	im.show()\n"+
			"	\n"+
			"def combinaCor(corA, corB):\n"+
			"	if(corA == 'red' and corB == 'yellow' or corA == 'yellow' and corB == 'red'):\n"+
      		"		cor = 'orange'\n"+
      		"		return geraImagem(cor)\n"+
   			"	elif(corA == 'blue' and corB == 'yellow' or corA == 'yellow' and corB == 'blue'):\n"+
			"		cor = 'green'\n"+
			"		return geraImagem(cor)\n"+
			"	elif(corA == 'red' and corB == 'blue' or corA == 'blue' and corB == 'red'):\n"+
			"		cor = 'purple'\n"+
			"		return geraImagem(cor)\n"+
			"	elif(corA == 'red' and corB == 'orange' or corA == 'orange' and corB == 'red'):\n"+
			"		cor = '#EF6111'\n"+
			"		return geraImagem(cor)\n"+
			"	elif(corA == 'yellow' and corB == 'orange' or corA == 'orange' and corB == 'yellow'):\n"+
			"		cor = '#FCB116'\n"+
			"		return geraImagem(cor)\n"+
			"	elif(corA == 'red' and corB == 'purple' or corA == 'purple' and corB == 'red'):\n"+
			"		cor = '#AA0A7'\n"+
			"		return geraImagem(cor)\n"+
			"	elif(corA == 'blue' and corB == 'purple' or corA == 'purple' and corB == 'blue'):\n"+
			"		cor = '#3B1B80'\n"+
			"		return geraImagem(cor)\n"+
			"	elif(corA == 'blue' and corB == 'green' or corA == 'green' and corB == 'blue'):\n"+
			"		cor = '#1B4D58'\n"+
			"		return geraImagem(cor)\n"+
			"	elif(corA == 'yellow' and corB== 'green' or corA == 'green' and corB == 'yellow'):\n"+
			"		cor = '#C5FC0B'\n"+
			"		return geraImagem(cor)\n" +
			"	else:\n" + 
			"		return print('Nao foi possivel combinar as cores ', corA, ' e ', corB)\n";

			StringBuilder buffer = new StringBuilder();
			buffer.append(preProg);
			for (ColorsParser.EntradaContext entradaCtx : ctx.entrada()) {
				buffer.append(visit(entradaCtx)+"\n");
			}
			return buffer.toString();
		}

		@Override 
		public String visitIgualdade(ColorsParser.IgualdadeContext ctx){ 
			String sVar = ctx.VAR().getText();
			String sExp = visit(ctx.exp());
			return sVar + "='" + sExp + "'\n";
		 }

		@Override 
		public String visitCombinar(ColorsParser.CombinarContext ctx) { 
			String sExp = visit(ctx.exp());
			String combinaCor = 
			"try:\n"+ 
			"	combinaCor(" + sExp + ")\n";
			return combinaCor + erroComb;			
		}

		@Override 
		public String visitMostrar(ColorsParser.MostrarContext ctx) { 
			String sExp = visit(ctx.exp());
			String gerarImagem = 
			"try:\n"+ 
			"	geraImagem(" + sExp + ")\n";
			return gerarImagem + erroMost;
		}

		@Override 
		public String visitVar(ColorsParser.VarContext ctx) { 
			String sVar = ctx.VAR().getText();
			return sVar; 
		}

		@Override 
	  	public String visitCombinacao(ColorsParser.CombinacaoContext ctx) {
			String corEsquerda = new String(ctx.exp(0).getText());
			String corDireita = new String(ctx.exp(1).getText());	
			corEsquerda = visit(ctx.exp(0));
			corDireita = visit(ctx.exp(1));
			return corEsquerda +","+corDireita;
	  	}
		
		@Override 
		public String visitCor(ColorsParser.CorContext ctx) { 
			String sCor = visit(ctx.cores());
			return sCor; 
		}

		@Override 
		public String visitAzul(ColorsParser.AzulContext ctx) { 
			String azul = "blue";	
			return azul;
		}

		@Override 
		public String visitAmarelo(ColorsParser.AmareloContext ctx) { 
			String amarelo = "yellow";	
			return amarelo;
		}

		@Override 
		public String visitVermelho(ColorsParser.VermelhoContext ctx) { 
			String vermelho = "red";	
			return vermelho;
		}

		@Override 
		public String visitLaranja(ColorsParser.LaranjaContext ctx) { 
			String laranja = "orange";	
			return laranja;
		}

		@Override 
		public String visitVerde(ColorsParser.VerdeContext ctx) { 
			String verde = "green";	
			return verde;
		}

		@Override 
		public String visitRoxo(ColorsParser.RoxoContext ctx) { 
			String roxo = "purple";	
			return roxo;
		}

        public String visitCinza(ColorsParser.CinzaContext ctx) { 
            String cinza = "grey";	
            return cinza;
		}
	}

	public static void main(String[] args) throws Exception {
    CharStream input;
    if (args.length > 0)
      input = CharStreams.fromFileName(args[0]);
    else
      input = CharStreams.fromStream(System.in);
    
    ColorsLexer lexer = new ColorsLexer(input);
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    ColorsParser parser = new ColorsParser(tokens);
  
    ParseTree tree = parser.prog();

    Cor cor = new Cor();

    System.out.println(cor.visit(tree));
  }
}