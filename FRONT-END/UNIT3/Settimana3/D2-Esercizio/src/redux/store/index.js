import { combineReducers, configureStore } from '@reduxjs/toolkit'
import pref from '../reducers/pref'
import getJob from '../reducers/jobs'
import getCompany from '../reducers/company'


const bigReducer = combineReducers({
  pref: pref, 
  job: getJob,
  company: getCompany
})

const store = configureStore({
  reducer: bigReducer,
})

export default store