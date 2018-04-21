package contracts

org.springframework.cloud.contract.spec.Contract.make {
    description("""
        get helloname JSON
    """)
    request {
        method "GET"
        url "/demo/patrick"
    }
    response {
        status 200
        body(file("givenNameProvided_expectJson-response.json"))
        headers {
            contentType(applicationJsonUtf8())
        }
    }
}