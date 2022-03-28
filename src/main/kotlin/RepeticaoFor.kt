fun main(args: Array<String>) {

    for (i in 1..10) { // Estrutura de repeticao for, com inicializacao e condicao, onde i vai de 1 ate 10
        println("Numero: $i")
        println("O quadrado de $i e ${i * i}")
    }

    for (i in 1..10 step 2) { // Estrutura de repeticao for, com inicializacao, condicao e passo, onde i vai de 1 ate 10 e passo 2
        println("Numero: $i")
        println("O quadrado de $i e ${i * i}")
    }

    for (i in 10 downTo 1 step 2) { // Estrutura de repeticao for, com inicializacao, condicao e passo, onde i vai de 10 ate 1 e passo 2
        println("Numero: $i")
        println("O quadrado de $i e ${i * i}")
    }

}

