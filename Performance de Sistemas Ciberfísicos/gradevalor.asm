start:
mov eax, 8

opcaoum:
mov ebx, 10
cmp eax, ebx
jnz opcaodois
mov edi, 1
jmp exit

opcaodois:
mov ebx, 9
cmp eax, ebx
jnz opcaotres
mov edi, 2
jmp exit

opcaotres:
mov ebx, 8
cmp eax, ebx
jnz elif
mov edi, 3
jmp exit

elif:
mov edi, 4

exit: