package testurlmappings

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?" {
            constraints {
                // apply constraints here
            }
        }


        get "/custom/mapping"(controller: 'test', action: 'index')

        "/"(view: "/index")
        "500"(view: '/error')
        "404"(view: '/notFound')
    }
}
