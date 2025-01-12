```groovy
def myMethod(List<String> list) {
  if (list != null) {
    list.each { item ->
      println item.toUpperCase()
    }
  } else {
    println "The list is null"
  }
}

myMethod(null)
myMethod(['apple', 'banana', 'cherry'])