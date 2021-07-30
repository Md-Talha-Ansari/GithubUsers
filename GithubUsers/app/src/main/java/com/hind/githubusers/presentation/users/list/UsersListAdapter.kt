package com.hind.githubusers.presentation.users.list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.hind.githubusers.R
import com.hind.githubusers.databinding.UsersListItemBinding
import com.hind.githubusers.domain.UserBasicInfo

class UsersListAdapter(val onClick: View.OnClickListener):
    RecyclerView.Adapter<UsersListAdapter.UsersListItemViewHolder>() {
    var userList = mutableListOf<UserBasicInfo>()

    /**
     * Add users to the list.
     * @param users New users.
     */
    fun addUsers(users:List<UserBasicInfo>){
        val lastItemPos = itemCount-1
        userList.addAll(users)
        notifyItemRangeChanged(lastItemPos,users.count())
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UsersListItemViewHolder {
        val binding = DataBindingUtil.inflate<UsersListItemBinding>(
            LayoutInflater.from(parent.context), R.layout.users_list_item,parent,false)
        return UsersListItemViewHolder(binding,onClick)
    }

    override fun onBindViewHolder(holder: UsersListItemViewHolder, position: Int) {
        holder.bind(userList[position])
    }

    override fun getItemCount() = userList.count()

    /**
     * RecyclerView View Holder for users list.
     * @property binding layout binding
     * @property onClick View click listener.
     */
    class UsersListItemViewHolder(val binding:UsersListItemBinding,val onClick:View.OnClickListener):RecyclerView.ViewHolder(binding.root) {

        /**
         * Method to set the binding.
         * @param userInfo User information.
         */
        fun bind(userInfo:UserBasicInfo){
            binding.userInfo = userInfo
            binding.root.setOnClickListener(onClick)
            binding.root.setTag(userInfo.login)
        }
    }

}