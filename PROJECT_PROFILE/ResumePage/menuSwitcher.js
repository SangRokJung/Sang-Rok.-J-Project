document.addEventListener('DOMContentLoaded', () => {

    const menuSwitcher = document.getElementById("menuSwitcher");
    const menu = document.getElementById("menu");
    let rotation = 0;

    menuSwitcher.addEventListener("click", () => {

        
        if(window.scrollY < 840) {
            rotation += 120;
            menu.style.transform = `rotate(${rotation}deg)`;
            window.scrollTo(0, 840)
        }
        

        //돌아갈 때 마다 특정한 위도우의 위치를 알려줘야된다.
    });
})

