git branch -> xem đang ở nhánh nào 
git checkout -b nhanhcuaquang -> tạo nhánh của bạn 

sau khi code xong 

 git add . 
 git commit -m "VD code nay cua quang " -> ghi chú ai sửa , sửa gì
 git push -u origin nhanhcuaquang -> đẩy code lên nhánh của bạn 


sau khi megre xong 

thì xóa code của mình đi 

git branch -d nhanhcuaquang -> sau khi pull xong và tạo request thì xóa nhánh bằng lệnh này 


sau khi xong mà muốn pull code mới nhất về thì hãy 

git checkout main -> này sẽ chuyển về nhánh main

xong thì pull code mới về và 
git pull
git pull -rebase origin main  -> này dùng ok hơn

