var request = require('request');
var fs = require('fs');

request('https://api.opendota.com/api/leagues', { json: true }, (err, res, body) => {
    //console.log(body)
    fs.writeFile("tournaments.json",JSON.stringify(body),'utf8');
});