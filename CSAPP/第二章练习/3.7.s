scale2:
    leaq (%rdi,%rdi,4),%rax
    leaq (%rax,%rsi,2),%rax
    leaq (%rax,%rdx,8),%rax
    ret