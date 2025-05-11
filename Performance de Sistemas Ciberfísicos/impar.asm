start:

mov eax, 467
mov ebx, 2

case:
div ebx
cmp edx, ecx
jz impar
jnz exit

impar:
mov edi, 1

exit: