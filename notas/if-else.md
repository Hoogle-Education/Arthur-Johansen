# Estruturas de Seleção

## if

usando variaveis booleanas:

```java
boolean isRaining = true;

if ( isRaining ) {
  System.out.println("Esta chovendo, nao vou sair");
}
```

usando expressoes booleanas

```java
double nota = 7.5;

if ( nota > 7.0 ) {
  System.out.println("Aprovado");
}
```

operadores booleanos:

- `==`, `!=`
- `>`, `>=`
- `<`, `<=`

### And: `&&`

O operador `&&` depende que ambos sejam `true` para dar `true`

```java
boolean hasCoffee = true
boolean hasWatter = true

// if (hasCoffee) {
//   if (hasWatter) {
//     ...
//   }
// }

if (hasCofee && hasWatter) {
  System.out.println("Consigo fazer cafe");
} else {
  System.out.println("Nao consigo");
}

// existe precedencia
// primeiro valida tamanho
// so se o tamanho der true
// analisa o conjunto
boolean response = tamanho > 5 && conjunto[4] == 2l;
```

### Or: `||`

O operador `||` depende que pelo menos um seja `true` para dar `true`

```java
boolean hasWatter = true;
boolean hasJuice = false;

if (hasJuice || hasWatter) {
  System.out.println("Consigo matar a sede");
} else {
  System.out.println("Nao consigo");
}
```

### Cuidados

> `=` eh para atribuicao (receba) e `==` que serve para comparacao

> `!` serve para negar qualquer expressao boleana

```java
double nota = 7.5;

if ( nota == 10.0 ) {
  System.out.println("Excleente");
}
```

```java
double numberOfDigitsFromCpfInput = 12;

if ( numberOfDigitsFromCpfInput != 11 ) {
  System.out.println("Houve algum erro!");
}
```

## if-else

```java
if ( nota >= 7.0 ) {
  System.out.println("Aprovado");
}

if ( nota < 7.0 ) {
  System.out.println("Recuperacao");
}
```

melhorando...

```java
if ( nota >= 7.0 ) {
  System.out.println("Aprovado");
} else {
  System.out.println("Recuperacao");
}
```

## if-else braceless

```java
if ( nota >= 7.0 )
  System.out.println("Aprovado");
else
  System.out.println("Recuperacao");
```

## if...else if...else

```java
if ( nota >= 7.0 ) {
  System.out.println("Aprovado");
} else { // 0 ate < 7
  if (nota >= 4) {
    System.out.println("Recuperacao");
  } else {
    System.out.println("Reprovado");
  }
}
```

```java
if ( nota >= 7.0 ) {
  System.out.println("Aprovado");
} else if (nota >= 4) {
  System.out.println("Recuperacao");
} else {
  System.out.println("Reprovado");
}
```

```java
if () {

} else if () {

} else if () {

} else if () {

} else {

}
```
