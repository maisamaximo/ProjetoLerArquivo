# ProjetoLerArquivo

Suponha que existem arquivos texto cujos conteúdos precisam ser lidos e exibidos na tela. O formato dos arquivos é o seguinte:
```
1
16/12/2005 20:00:00
John Howard
58    158.20      10/11/1980  FC3E3444D   8
63    200.14      06/04/1991  ABC123EFG   7
20    314.74      02/02/2010  DAC942FFF   4
```
A primeira linha contém a definição das colunas do arquivo. No caso acima, o número 1 indica que a primeira coluna contém um int, a segunda contém um float, a terceira contém uma data, a quarta contém uma String e a quinta contém um int. Dessa forma, arquivos com o número 2 contém outras definições de colunas. A segunda linha contém a data e a hora que o arquivo foi gerado. A terceira linha contém o nome do usuário que gerou o arquivo. O conteúdo do arquivo é gravado a partir da quarta linha.

Crie um design que permita que o conteúdo dos arquivos seja lido e exibido na tela. Nesse momento, o conteúdo deverá somente ser exibido na tela, mas em breve, o conteúdo deverá ser validado e salvo em banco de dados (então, não basta somente ler cada valor como uma String). Considere que as primeiras 3 linhas sempre contêm o mesmo conteúdo (isto é, o número que identifica a definição das colunas, a data da geração do arquivo e o nome do usuário que gerou o arquivo). Considere também que a definição das colunas é conhecida para cada número. Então, no caso acima, sabe-se que as colunas de arquivos 1 contêm um int, um float, uma data, uma String e um int. E finalmente, considere também que cada coluna é separada por um tab (“\t”).

 
Focusnetworks HyperClass :heart: Project
