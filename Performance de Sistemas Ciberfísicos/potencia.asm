start:

mov eax, 5
mov ebx, 5
mov edi, 1

loopstart:
cmp ebx, 0
jz exit
mul edi
mov edi, eax
dec ebx
jmp loopstart

exit: