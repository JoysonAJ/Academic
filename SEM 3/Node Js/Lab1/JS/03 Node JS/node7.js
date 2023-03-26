const http = require('http');
const myModule = require("./nodeModule")

http.createServer( (req,res)=>{
    res.writeHead(200,{
        'Content-Type' : 'text/html'
    })
    res.write("The text is "+myModule.myModule())
    res.end()
}).listen(3000)