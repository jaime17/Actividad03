//  Write some awesome Swift code, or import libraries like "Foundation",
//  "Dispatch", or "Glibc"

class FetchClass {
    var vector: [Int] = []
    func fetch(n: Int)->Int{
        preconditionFailure("")
    }
    func setX(x: [Int]){
        self.vector = x
    }
    func randomX(n:Int)->[Int]{
        var v:[Int] = [Int]()
        for _ in 0...(n-1) {
            x.append(Int(arc4random_uniform(200)))
        }
        return x
    }
    func getX()->[Int]{
        return self.vector
    }
    func showV(){
        let count:Int = self.vector.count-1
        var string = "["
        for(index) In 0...count{
            string+=String(self.vector[index])
            string+=","
        }
        string = String(string.characters.dropLast()) + "]"
        print(string)
    }
    func showF(n: Int){
        if(n==(-1)){print("El numero no se encuentra en el vector")}
        else
        {print("El numero se encuentra en la posición \(n)")}
    }
}
class binario: FetchClass{
    override func fetch(n: Int) -> Int {
        var centro: Int = 0
        var inicio: Int = 0
        var fin: Int = self.vector.count-1
        
        while(inicio<=fin){
            centro=(inicio+fin)/2
            
            if(self.vector[centro]==n){return centro}
            
            if(n < self.vector[centro]){
                fin = centro-1
            } else {
                inicio = centro+1
            }
        }
        return -1
    }
}

class secuencial: FetchClass{
    override func fetch(n: Int) -> Int {
        let count:Int = self.vector.count-1
        for i in 0...count{
            if(self.vector[i]==n){return i}
        }
        return -1
    }
}

var test: secuencial = secuencial()
test.setV(v: test.randomV(n: 400))
test.showV()
test.showF(n: test.fetch(n: 50))
