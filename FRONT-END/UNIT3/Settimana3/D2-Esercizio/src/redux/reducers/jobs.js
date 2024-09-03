import { GET_JOB } from '../actions'

const initialState = {
  jobs: [],
}

const getJob = (state = initialState, action) => {
  switch (action.type) {
    case GET_JOB:
      return {
        ...state,
        jobs: action.payload,
      }

    default:
      return state
  }
}

export default getJob