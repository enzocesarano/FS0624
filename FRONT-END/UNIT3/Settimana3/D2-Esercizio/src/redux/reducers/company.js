import { GET_COMPANY } from '../actions'

const initialState = {
  company: [],
}

const getCompany = (state = initialState, action) => {
  switch (action.type) {
    case GET_COMPANY:
      return {
        ...state,
        company: action.payload,
      }

    default:
      return state
  }
}

export default getCompany