# Requisitos Técnicos

Aqui contém os requisitos técnicos e seus devidos passo a passo, para rodar o projeto localmente na máquina.

## Apps

- Java: instalar e configurar JDK (vários tutoriais no yt)
- Apache Maven: instalar e configurar apache maven (vários tutoriais no yt)
- Intellij IDE
- Git: instalar e configurar (vários tutoriais no yt)
- Github: cadastrar-se na plataforma 
- MySQL Workbench

### Docker

1. **Instale o Docker:**
   Se você ainda não tem o Docker instalado, você precisará instalá-lo. Você pode fazer o download e seguir as instruções de instalação no [site oficial do Docker](https://docs.docker.com/get-docker/).

2. **Configure o Docker:**
   Abra-o e crie uma conta

2. **Baixe a imagem do MySQL:**
   Depois de aberto, vc pode baixar a imagem oficial do MySQL do Docker Hub executando o seguinte comando no seu terminal:
   ```
   docker pull mysql
   ```

3. **Crie um container MySQL:**
   Agora que você tem a imagem do MySQL baixada, você pode criar e executar um contêiner a partir dela. Use o seguinte comando:
   ```
   docker run -d --name mysql-db -p 3306:3306 -e "MYSQL_ROOT_PASSWORD=admin" mysql
   ```
   - `--name mysql-db`: Define um nome para o seu contêiner. Aqui, estou usando "mysql-db", mas você pode escolher qualquer nome.
   - `-e MYSQL_ROOT_PASSWORD=admin`: Define a senha do usuário root do MySQL. Substitua "admin" pela senha que deseja usar.
   - `-d`: Executa o contêiner em segundo plano.

4. **Verifique se o contêiner está em execução:**
   Você pode verificar se o contêiner está em execução com o seguinte comando:
   ```
   docker ps
   ```

5. **Conecte-se ao MySQL:**
   Abra o MySQL Workbench e crie uma nova conexão, coloque um nome que escolher, o user como root e password a senha com qual criou o container do docker.

Este é um processo básico para rodar um contêiner Docker local usando uma imagem genérica do MySQL. Você pode personalizar as configurações do MySQL conforme necessário, adicionando opções ao comando `docker run` ou montando volumes para persistência de dados, se desejar.

