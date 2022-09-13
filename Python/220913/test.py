from bs4 import BeautifulSoup 
from selenium import webdriver 
from selenium.webdriver.common.keys import Keys 
import time 
driver = webdriver.Chrome() 
url = "https://korean.visitkorea.or.kr/search/search_list.do?keyword=%EB%B4%84%EC%97%AC%ED%96%89" 
driver.get(url) 
time.sleep(3) 
cnt = 0 
page_num = 6 
for i in range(1, page_num+1): 
    driver.find_element_by_xpath(f'//*[@class="page_box"]/*[@id={i}]').send_keys(Keys.ENTER)
    time.sleep(3) 
    soup = BeautifulSoup(driver.page_source, 'html.parser') 
    titles = soup.select('div[class="tit"] > a') 
    locations = soup.select('div[class="service"]>p') 
    hashtags = soup.select('p[class="tag_type"]') 
    for t, l, h in zip(titles, locations, hashtags): 
        print(f'페이지 번호: {i}') 
        print('제목:', t.get_text()) 
        print('지역:', l.get_text()) 
        print('해쉬태그:', h.get_text()) 
        cnt += 1 
        print(f'{page_num}페이지까지 게시글 수: {cnt}')