const mysql = require("mysql");

const con = mysql.createConnection({
    host: "localhost",
    user: "root",
    password: "",
});

con.connect((err) => {
    if (err) throw err;
    else console.log("Connected........");
});
