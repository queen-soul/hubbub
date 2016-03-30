package qod

class QuoteController {

    static scaffold =  Quote
    static  defaultAction = "home"
    def QuoteService quoteService

    def home(){
        render "<h1>Real Programmers do not eat Quiche</h1>"
    }

    def random() {
        [ quote : quoteService.randomQuote]
    }

    def ajaxRandom() {
        def randomQuote = quoteService.getRandomQuote()
        render {
            q(randomQuote.content)
            p(randomQuote.author)
        }
    }
}
