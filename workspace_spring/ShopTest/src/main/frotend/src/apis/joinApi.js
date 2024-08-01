import axios from "axios";

export const checkId = (data) => {
  const response = axios.get(`/member/checkId/${data}`);
  return response;
}

export const join = (data) => {
  const response= axios.post('/member/join', data);
  return response;
}