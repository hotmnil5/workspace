import axios from "axios"

// 댓글 목록 조회
export const selectReply = (boardNum) => {
  const response = axios.get(`/reply/list/${boardNum}`);
  return response;
}