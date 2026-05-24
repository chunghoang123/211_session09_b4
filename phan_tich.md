
## Sự khác biệt giữa môi trường Dev và Prod

### Môi trường Dev

- Mục đích chính là hỗ trợ lập trình viên phát triển và debug ứng dụng.
- Log được in trực tiếp ra Console để dễ quan sát.
- Sử dụng mức DEBUG để hiển thị nhiều thông tin chi tiết phục vụ kiểm tra lỗi.
- Không cần lưu log lâu dài vì chỉ phục vụ quá trình phát triển.

### Môi trường Prod

- Mục đích chính là vận hành hệ thống thực tế.
- Log phải được lưu ra file để phục vụ giám sát và điều tra sự cố.
- Chỉ ghi từ mức INFO trở lên nhằm giảm dung lượng log.
- Sử dụng cơ chế Rolling File để tự động cắt file khi đạt kích thước giới hạn.
- Giữ log tối đa 30 ngày để tránh đầy ổ cứng server.
- Có thể nén log cũ giúp tiết kiệm dung lượng lưu trữ.

## Kết luận

Dev ưu tiên khả năng debug và quan sát trực tiếp.
Prod ưu tiên ổn định hệ thống, lưu trữ log lâu dài và kiểm soát dung lượng ổ cứng.