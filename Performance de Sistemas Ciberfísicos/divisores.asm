start:

mov eax, 67
mov edi, 0
mov ebx, 1

loopstart:
cmp ebx, eax
jg exit
mov edx, 0
mov eax, ebx
div ebx
cmp edx, 0
jnz naodivide
inc edi

naodivide:
inc ebx
jmp loopstart

exit: