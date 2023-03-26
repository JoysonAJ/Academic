const nodemailer = require('nodemailer')
const transporter = nodemailer.createTransport ({
    service: 'gmail',
    auth:{
        user: '2117010antony@staloysius.ac.in',
        pass: ''
    }});
const mailOptions={
    from: '2117010antony@staloysius.ac.in',
    to: '2117092prithvi@staloysius.ac.in',
    subject : 'Sending Email using Node.js',
    text: 'That was easy!'
};
transporter.sendMail (mailOptions,  (error,info)=>{
    if(error){
        console.log (error);
    } else{
        console.log ('Email sent: ' + info.response);
    }
});