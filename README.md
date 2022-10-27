## HNG Stage 1 App

### Deployment Details

You can start the application locally after downloading or cloning the repository using 

    ./mvnw -DskipTests spring-boot:run

running on port [Local Host](http://localhost:8080)

The live url of the application is at [HNG Stage I App](https://official-volunux.uc.r.appspot.com)


### Task Description

- Setup a server (Host)
- Create an **(GET)** api endoint that returns the following  json response:

  { "**slackUsername**": String, "**backend**": Boolean, "**age**": Integer, "**bio**": String }

    - SlackUsername should be a **string** datatype and your slack username
    - Backend should be a **boolean** datatype
    - Age should be an  **integer** datatype
    - Bio(description about yourself) should be a **string** datatype
- Push to **GitHub**

**Sample Input:** does not apply
****None

**Sample Response Format**
{ "**slackUsername**": String, "**backend**": Boolean, "**age**": Integer, "**bio**": String }