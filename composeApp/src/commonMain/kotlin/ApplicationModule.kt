import org.koin.core.module.Module
import org.koin.dsl.module

val applicationModule: Module = module {
    single<String> { "Raheem" }
}