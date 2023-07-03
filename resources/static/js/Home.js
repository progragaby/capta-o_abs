var menuIten = document.querySelectorAll('.item-menu')

function selectLink(){
  menuIten.forEach((item)=>
       item.classList.remove('ativo')
  )
  this.classList.add('ativo')
  
}

menuIten.forEach((item)=>
    item.addEventListener('click', selectLink)
)

// Expandir Botão 

var btnExp = document.querySelector('#btn-exp')
var menuSide = document.querySelector('.menu-lateral')

btnExp.addEventListener('click', function(){
  menuSide.classList.toggle('expandir')
})