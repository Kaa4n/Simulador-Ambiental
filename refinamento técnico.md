# Simulador de Impacto Ambiental dos Transportes

### Descrição do Projeto:

A calculadora de pegada de carbono é uma ferramenta que permite aos usuários calcular o impacto ambiental de suas atividades diárias, levando em consideração fatores como transporte, consumo de energia, alimentação e estilo de vida. A API fornecerá endpoints para receber dados de entrada dos usuários, processar essas informações e retornar o resultado do cálculo da pegada de carbono, juntamente com sugestões personalizadas para redução do impacto ambiental.

### Tecnologias Utilizadas:

- **Java**: Linguagem de programação principal para o desenvolvimento da API.
- **Spring Boot**: Framework para criação de APIs RESTful em Java, facilitando o desenvolvimento de endpoints e gerenciamento de dependências.
- **Spring Data**: Para integração com banco de dados, permitindo armazenar e recuperar dados relacionados aos usuários e seus cálculos de pegada de carbono.
- **Banco de Dados SQL (por exemplo, MySQL, PostgreSQL)**: Para armazenar os dados dos usuários e seus cálculos de pegada de carbono.
- **Swagger/OpenAPI**: Para documentação automática da API, facilitando a compreensão dos endpoints e parâmetros disponíveis (opcional).

### Endpoints

1. **/usuarios/{id}/meio-transporte**:
   - Método: POST
   - Descrição: Este endpoint permite que um usuário salve as informações sobre o meio de transporte que utiliza. O {id} representa o identificador único do usuário.

2. **/usuarios/{id}/impactos-ambientais**:
   - Método: GET
   - Descrição: Este endpoint permite que um usuário consulte os impactos ambientais causados pelo meio de transporte que ele utiliza. O {id} representa o identificador único do usuário.

3. **/usuarios/{id}/sugestoes**:
   - Método: GET
   - Descrição: Este endpoint fornece sugestões de como reduzir os impactos ambientais causados por um usuário de acordo com as informações dadas do meio de transporte utilizado.
   - Ex de Sugestões: incluir mudanças de hábitos, escolhas de transporte mais sustentáveis, compartilhar caronas, utilizar bicicletas/caminhada dependendo da distância, entre outras práticas ambientais.

### Estrutura da API:
- **Endpoints REST**: Implementar endpoints para cada funcionalidade da API, seguindo boas práticas de design REST.
- **Camada de Serviços**: Lógica de negócios para processar os dados recebidos dos endpoints, realizar os cálculos e gerar as sugestões.
- **Camada de Acesso a Dados**: Integração com o banco de dados para armazenar informações dos usuários e seus cálculos de pegada de carbono.
- **Camada de Segurança**: Implementar mecanismos de autenticação e autorização para proteger os dados dos usuários e garantir o acesso seguro aos endpoints.

### Considerações Finais:
A implementação desta API não só fornecerá aos usuários uma ferramenta para avaliar seu impacto ambiental, mas também oferecerá sugestões concretas para reduzir esse impacto, contribuindo assim para a conscientização e ação em prol da sustentabilidade ambiental.