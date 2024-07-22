const Detail = () => {
  <div>
    <table>
      <colgroup>
        <col width='20%'/>
        <col width='*'/>
      </colgroup>
      <thead>
        <tr>
          <td>제목</td>
          <td><input /></td>
        </tr>
        <tr>
          <td>내용</td>
          <td><textarea /></td>
        </tr>
      </thead>
      <tbody></tbody>
    </table>
    <button type="button" className="btn">글등록</button>
  </div>
}
export default Detail;