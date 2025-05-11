start:
mov EAX, 1999
mov EBX, 12
mov ECX, 19

mov EDI, 2025
sub EDI, EAX
mov EDX, 3
cmp EBX, EDX
jb exit
ja compare
mov EDX, 19
cmp ECX, EDX
jbe exit

compare:
sub EDI, 1

exit: