# Assignment 02 - Session 04 - Loop

![Java](https://img.shields.io/badge/Java-21-orange?logo=openjdk)
![Status](https://img.shields.io/badge/status-completed-brightgreen)

<!-- TOC -->

* [Assignment 02 - Session 04 - Loop](#assignment-02---session-04---loop)
    * [Prerequisites](#prerequisites)
        * [Project Structure](#project-structure)
        * [Environment](#environment)
    * [Questions](#questions)
        * [Câu 1](#câu-1)
        * [Câu 2](#câu-2)
        * [Câu 3](#câu-3)
        * [Câu 4](#câu-4)
        * [Câu 5](#câu-5)
    * [Author](#author)

<!-- TOC -->

## Prerequisites

### Project Structure

```text
./
│   .gitignore
│   README.md
└───src
        Question01.java
        Question02.java
        Question03.java
        Question04.java
        Question05.java
```

### Environment

- IDE: IntelliJ IDEA
- JDK: 21 or higher

## Questions

### Câu 1

- **Đề bài**:
    - Xây dựng trò chơi Oẳn Tù Tì (Bao, Kéo, Bao). Người và máy sẽ chơi với nhau.
    - Nhấn một số khác 0 để chơi tiếp, nhấn 0 để dừng lại.
    - Tính xem ai là người chơi thắng nhiều nhất và tỉ số.

- **Mô hình 3 khối**:

   ```mermaid
   flowchart LR
       INPUT --> PROCESS --> OUTPUT
       
       INPUT["`**Input**
           Cho người dùng nhập 1 số
       `"]
       
       subgraph PROCESS["`**Process**`"]
           STEP1  --> STEP2 --> STEP3 --> STEP4 --> STEP5 --> STEP6 --> STEP7
           
           STEP1["Gán giá trị nhập vào biến type và kiểm tra số người dùng có hợp lệ (0,1,2,3)"]
           STEP2["Nếu type = 0, thoát chương trình"]
           STEP3["Tạo và gán giá trị cho các biến: userWins=0; computerWins=0; phrase=0]"]
           STEP4["Tạo ra số ngẫu nhiên trong khoảng [1,3]"]
           STEP5["Chọn giá trị (Bao-1, Kéo-2, Búa-3) dựa vào số nhập của người dùng và số random"]
           STEP6["Điều kiện: Bao > Búa, Bùa > Kéo, Kéo > Búa dể xác định người thắng trong trận và tăng tỷ số"]
           STEP7["Lặp lại đến khi giá trị nhập vào là 0"]
       end
       
       OUTPUT["`**Output**
           In ra thông báo: xác định người thắng và tỷ số
       `"]
   ```

- **Ví dụ** (một ván): Nhập `1` (Bao) → máy random ra `3` (Búa) → `Người chơi thắng`.

### Câu 2

- **Đề bài**:
    - Tìm số nguyên dương n nhỏ nhất sao cho: 1 + 2 + 3 + ... n > 10000

- **Mô hình 3 khối**:

   ```mermaid
   flowchart LR
       INPUT --> PROCESS --> OUTPUT
       
       INPUT["`**Input**`"]
       
       subgraph PROCESS["`**Process**`"]
           STEP1  --> STEP2 --> STEP3 --> STEP4
           
           STEP1["Tạo các biến: total=0, MIN_TOTAL_NUMBERS = 10000 và n"]
           STEP2["Khởi tạo biến i=1, total =0;"]
           STEP3["Tính và gán giá trị: total = total + 1"]
           STEP4["Nếu total >= MIN_TOTAL_NUMBERS, gán n = i và thoát vòng lặp. Ngược lại tăng i thêm 1, lặp lại STEP3"]
       end
       
       OUTPUT["`**Output**
           In ra thông báo và số nguên n nhỏ nhất
       `"]
   ```

### Câu 3

- **Đề bài**:
    - Viết chương trình tính tổng các số lẻ nguyên dương nhỏ hơn n, được nhập từ người dùng.
    - Chỉ cho phép nhập số > 0, yêu cầu nhập lại nếu không đúng yêu cầu.

- **Mô hình 3 khối**:

   ```mermaid
   flowchart LR
       INPUT --> PROCESS --> OUTPUT
       
       INPUT["`**Input**
           Nhập vào 1 số
       `"]
       
       subgraph PROCESS["`**Process**`"]
           STEP1  --> STEP2 --> STEP3 
           
           STEP1["Kiểm tra số đã nhập thỏa điều kiện > 0"]
           STEP2["Gán cho biến n nếu thỏa, ngược lại, phải nhập lại"]
           STEP3["Tạo biến total = 0 và tính theo công thức: total = total + i nếu i không chia hết cho 2 và i < n"]
       end
       
       OUTPUT["`**Output**
           In ra thông báo tồng các số nguyên lẻ nhỏ hơn n
       `"]
   ```

- **Ví dụ**:

    | n  | Kết quả                                        |
    |----|------------------------------------------------|
    | 10 | `Tổng các số lẻ nguyên dương nhỏ hơn n là: 25` |

### Câu 4

- **Đề bài**:
    - Viết chương trình nhập n và tính tổng `S(n) = x + x^2 + x^3 + ... + x^n`.

- **Mô hình 3 khối**:

   ```mermaid
   flowchart LR
       INPUT --> PROCESS --> OUTPUT
       
       INPUT["`**Input**
           Nhập vào số nguyên n và x
       `"]
       
       subgraph PROCESS["`**Process**`"]
           STEP1  --> STEP2
           
           STEP1["Gán giá trị nhập vào lần lượt cho n và x. Tạo biến s để lưu tổng"]
           STEP2["Tính tổng theo công thức: s = s + x ^ i với i từ 1 đến n"]
       end
       
       OUTPUT["`**Output**
           In ra tổng
       `"]
   ```

- **Ví dụ**:

    | n | x | Kết quả                               |
    |---|---|---------------------------------------|
    | 5 | 2 | `S(n) = x^1 + x^2 + ... + x^n = 62.0` |

### Câu 5

- **Đề bài**:
    - Viết chương trình tính và in số năm chờ đợi.
    - Anh X có một số tiền nhàn rỗi. Anh đem đi gửi tiết kiệm số tiền này. Anh X hy vọng rằng đến một lúc nào đó trong
      tương lai, anh sẽ có đủ tiền để mua một chiếc ô tô.
    - Cho biết số tiền anh X gửi, số tiền anh X muốn có trong tương lai và tiền lãi tiết kiệm
    - Hãy viết chương trình tính số năm ít nhất mà anh X phải chờ đợi kể từ năm gởi tiền
    - Giả sử lãi suất tiết kiệm không đổi, anh X không rút bớt tiền và cũng không gởi thêm tiền trong thời gian chờ đợi.

- **Mô hình 3 khối**:

   ```mermaid
   flowchart LR
       INPUT --> PROCESS --> OUTPUT
       
       INPUT["`**Input**
           Nhập vào số tiền đang có, só tiền mong muốn, và lãi suất theo năm (%)
       `"]
       
       subgraph PROCESS["`**Process**`"]
           STEP1  --> STEP2 --> STEP3
           
           STEP1["Kiểm ra đầu vào có hợp lệ không"]
           STEP2["Gán lần lượt các giá trị cho các biến: money, interest và percent. Tạo biến year: số năm đạt đủ tiền"]
           STEP3["Tính tổng tiền sau khi nhận gộp lãi: money = money + money * interest / 100 và tăng biến year lên 1"]
           STEP4["Khi nào money >= interest thì in ra year, nếu không, lặp lại bước 3"]
       end
       
       OUTPUT["`**Output**
           In ra thông báo số tiền tích lũy được thực tế và số năm
       `"]
   ```

- **Ví dụ**:

    | Số tiền hiện có | Số tiền mong muốn | Lãi suất/năm | Kết quả |
    |-----------------|-------------------|--------------|---------|
    | 1000            | 1200              | 10%          | `2 năm` |

## Author

Khang Nguyen
