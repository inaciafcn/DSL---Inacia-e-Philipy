from PIL import Image, ImageFilter, ImageColor, ImageDraw, ImageFont
def geraImagem(cor):
	if(cor == '#EF6111'):
		nomeCor = 'Red-Orange'
	elif(cor == '#C5FC0B'):
		nomeCor = 'Yellow-Green'
	elif(cor == '#FCB116'):
		nomeCor = 'Yellow-Orange'
	elif(cor == '#AA0A76'):
		nomeCor = 'Red-Violet'
	elif(cor == '#3B1B80'):
		nomeCor = 'Blue-Violet'
	elif(cor == '#1B4D58'):
		nomeCor = 'Blue-Green'
	else:
		nomeCor = cor
	img = Image.new('RGB', (256, 256), ImageColor.getrgb(cor))
	img.save(nomeCor+'.jpg','JPEG')
	base = Image.open(nomeCor+'.jpg').convert('RGBA')
	txt = Image.new('RGBA', base.size, (255,255,255,0))
	fnt = ImageFont.truetype('stocky.ttf', 40)
	d = ImageDraw.Draw(txt)
	d.text((10,60), nomeCor, font=fnt, fill=(255,255,255,255))
	out = Image.alpha_composite(base, txt)
	out.save(nomeCor+'.png','PNG')
	imagem = nomeCor + '.png'
	im = Image.open(imagem)
	im.show()
	
def combinaCor(corA, corB):
	if(corA == 'red' and corB == 'yellow' or corA == 'yellow' and corB == 'red'):
		cor = 'orange'
		return geraImagem(cor)
	elif(corA == 'blue' and corB == 'yellow' or corA == 'yellow' and corB == 'blue'):
		cor = 'green'
		return geraImagem(cor)
	elif(corA == 'red' and corB == 'blue' or corA == 'blue' and corB == 'red'):
		cor = 'purple'
		return geraImagem(cor)
	elif(corA == 'red' and corB == 'orange' or corA == 'orange' and corB == 'red'):
		cor = '#EF6111'
		return geraImagem(cor)
	elif(corA == 'yellow' and corB == 'orange' or corA == 'orange' and corB == 'yellow'):
		cor = '#FCB116'
		return geraImagem(cor)
	elif(corA == 'red' and corB == 'purple' or corA == 'purple' and corB == 'red'):
		cor = '#AA0A7'
		return geraImagem(cor)
	elif(corA == 'blue' and corB == 'purple' or corA == 'purple' and corB == 'blue'):
		cor = '#3B1B80'
		return geraImagem(cor)
	elif(corA == 'blue' and corB == 'green' or corA == 'green' and corB == 'blue'):
		cor = '#1B4D58'
		return geraImagem(cor)
	elif(corA == 'yellow' and corB== 'green' or corA == 'green' and corB == 'yellow'):
		cor = '#C5FC0B'
		return geraImagem(cor)
	else:
		return print('Nao foi possivel combinar as cores ', corA, ' e ', corB)
a='blue'

try:
	geraImagem(a)
except:
	print('Nao foi possivel mostrar essa cor. Verifique a cor digitada')

