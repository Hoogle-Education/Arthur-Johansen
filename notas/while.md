# Repetição com `while`

## Pilares

- Inicializacao
- Verificacao
- Atualizacao

## Exemplos

```java
boolean isRaining = true;

// loop infinito - falta atualizacao
while (isRaining) {
  System.out.println("vou aguardar");
} 

// loop infinito - falta atualizacao
// while ( true ) {

// }
```

```java
int hours = 13; // inicializacao

while (hours < 17) { // verificao
  System.out.println("vou aguardar... Horario atual: " + hours + ":00");
  hours++; // atualizacao
}
```

```txt
vou aguardar... Horario atual: 13:00
vou aguardar... Horario atual: 14:00
vou aguardar... Horario atual: 15:00
vou aguardar... Horario atual: 16:00
```

## contador

```java
int count = 1; // inicializacao

while (count < 11) { // verificacao
  System.out.println("Contador: " + count);
  count++; // atualizacao
}
```

```java
int count = -4; // seria entrada usuario

while (count != 0) {
  if(count < 0) {
    System.out.println("Subindo");
    count++;
  } else {
    System.out.println("Descendo");
    count--;
  }
}
```
