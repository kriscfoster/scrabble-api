const fs = require('fs');
const arr = fs.readFileSync('scrabbleWords.txt').toString().split('\n');
const duplicates = arr.filter((item, index) => arr.indexOf(item) !== index)

console.log(`populated ${arr.length} words\n${duplicates.length} duplicate words: [${duplicates}]`);

let sql = '';

arr.forEach((word, i) => {
    console.log(`${i}: word`);
    sql += `INSERT INTO word (name) VALUES ('${word}');\n`
})

fs.writeFileSync('./src/main/resources/data.sql', sql);
