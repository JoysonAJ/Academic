const log = {
    info: (info) => {
        console.log(`INFO ${info}`);
    },
    warning: (w) => {
        console.log('warning' + w);
    },
    error: (e) => {
        console.log('error' + e);
    }
};
module.exports = log;