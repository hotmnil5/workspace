import axios from "axios";

export const getCarList = () => {
  const response = axios.get('/car/list');
  return response;
}