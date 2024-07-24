const WriteForm = () => {
  return (
    <>
      <table>
        <thead>
          <tr>
            <td>제목</td>
            <td><input /></td>
          </tr>
          <tr>
            <td>내용</td>
            <textarea />
          </tr>
        </thead>
        <tbody></tbody>
      </table>
      <button type="button">글등록</button>
    </>
  )
};

export default WriteForm