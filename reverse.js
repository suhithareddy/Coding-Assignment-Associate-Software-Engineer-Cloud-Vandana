var s = "This is a sunny day";
console.log("original string : " , s)
function reverse(s){
    var duplicate="";
    for(var i=s.length-1; i>=0; i--){
        duplicate += s.charAt(i);
    }
    return duplicate;
}

var words = s.split(' ');
for(var i=0; i<words.length;i++){
    words[i] = reverse(words[i])

}
var result = words.join(' ');
console.log("After revesring : " ,result);

