document.addEventListener('DOMContentLoaded', () => {
    const upBtnTag = document.querySelector('.up_icon')
    const link = "./index.html"

    upBtnTag.addEventListener('click', (event)=>{
        window.open(link)
    })
})