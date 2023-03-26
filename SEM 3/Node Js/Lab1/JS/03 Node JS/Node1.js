const http = require("http")
http.createServer((request,response)=>{
    response.writeHead(200,{
        'Content-Type' : 'text/Plain'
    });
    response.end("HELLO WORLD");
}).listen(3000);

console.log("Server runnig on localhost:3000");


