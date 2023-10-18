var ar =[10,23,2,34,4]
console.log("original array :" , ar)   
var res= ar.sort((a,b)=>{
    return b-a;
})
console.log("After sorting: " ,res)
