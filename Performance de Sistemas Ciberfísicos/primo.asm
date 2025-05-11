start:

mov eax, 47
mov edi, 1
jle naoprimo
mov ebx, 2

loopstart:
imul edx, ebx, ebx
cmp edx, eax
jg exit
mov edx, 0
div ebx
cmp edx, 0
jz naoprimo
inc ebx
jmp loopstart

naoprimo:
mov edi, 0

exit: