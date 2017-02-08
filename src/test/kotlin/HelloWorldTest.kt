import com.winterbe.expekt.should
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it

object HelloWorldTest : Spek({
    describe("The greeting function") {
        it("returns hello world") {
            greeting().should.equal("Hello world!")
        }
    }
})