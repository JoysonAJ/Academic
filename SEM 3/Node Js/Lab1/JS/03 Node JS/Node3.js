const http = require("http")
// npm i formidable
const formidable = require("formidable")

http.createServer((req,res)=>{
    if(req.url == '/fileupload'){
        const form = new formidable.IncomingForm();
        form.parse(req,(err,fields,files)=>{
            res.write("File Uploaded")
            res.end();
        })
    }else{
        res.writeHead(200,{
            'Content-type' : 'text/html'
        });
        res.write('<form action="fileupload" method="post">')
        res.write('<input type="file" name="fileupload">')
        res.write("<br>")
        res.write("<input type='submit'>")
        res.write("</form>")
        return res.end()
    }
}).listen(3000)

console.log("Server is ruuning server on localhost:3000");