package testurlmappings

class UrlMappings {

    static mappings = {
        get "/custom/mapping"(controller: 'test', action: 'index')

        "/"(view: "/index")
    }
}
