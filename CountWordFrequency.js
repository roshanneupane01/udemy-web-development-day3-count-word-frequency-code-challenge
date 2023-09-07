let wordArray = ["Apple", "Banana", "Orange", "Apple", "Orange", "Banana", "Apple"]

let wordFrequencyCount = wordArr => {
    let wordMap = new Map()
    wordArr.forEach(word => {
        if(!wordMap.has(word)){
            wordMap.set(word, 1)
        }else{
            wordMap.set(word, wordMap.get(word) + 1)
        }
    });
    return wordMap
}

let result = wordFrequencyCount(wordArray)
console.log(result)