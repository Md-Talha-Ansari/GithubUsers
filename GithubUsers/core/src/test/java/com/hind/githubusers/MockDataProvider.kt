package com.hind.githubusers

import com.hind.githubusers.domain.RemoteException

object MockDataProvider {

    fun getUsers() = "[\n" +
            "    {\n" +
            "        \"login\": \"mojombo\",\n" +
            "        \"id\": 1,\n" +
            "        \"node_id\": \"MDQ6VXNlcjE=\",\n" +
            "        \"avatar_url\": \"https://avatars.githubusercontent.com/u/1?v=4\",\n" +
            "        \"gravatar_id\": \"\",\n" +
            "        \"url\": \"https://api.github.com/users/mojombo\",\n" +
            "        \"html_url\": \"https://github.com/mojombo\",\n" +
            "        \"followers_url\": \"https://api.github.com/users/mojombo/followers\",\n" +
            "        \"following_url\": \"https://api.github.com/users/mojombo/following{/other_user}\",\n" +
            "        \"gists_url\": \"https://api.github.com/users/mojombo/gists{/gist_id}\",\n" +
            "        \"starred_url\": \"https://api.github.com/users/mojombo/starred{/owner}{/repo}\",\n" +
            "        \"subscriptions_url\": \"https://api.github.com/users/mojombo/subscriptions\",\n" +
            "        \"organizations_url\": \"https://api.github.com/users/mojombo/orgs\",\n" +
            "        \"repos_url\": \"https://api.github.com/users/mojombo/repos\",\n" +
            "        \"events_url\": \"https://api.github.com/users/mojombo/events{/privacy}\",\n" +
            "        \"received_events_url\": \"https://api.github.com/users/mojombo/received_events\",\n" +
            "        \"type\": \"User\",\n" +
            "        \"site_admin\": false\n" +
            "    },\n" +
            "    {\n" +
            "        \"login\": \"defunkt\",\n" +
            "        \"id\": 2,\n" +
            "        \"node_id\": \"MDQ6VXNlcjI=\",\n" +
            "        \"avatar_url\": \"https://avatars.githubusercontent.com/u/2?v=4\",\n" +
            "        \"gravatar_id\": \"\",\n" +
            "        \"url\": \"https://api.github.com/users/defunkt\",\n" +
            "        \"html_url\": \"https://github.com/defunkt\",\n" +
            "        \"followers_url\": \"https://api.github.com/users/defunkt/followers\",\n" +
            "        \"following_url\": \"https://api.github.com/users/defunkt/following{/other_user}\",\n" +
            "        \"gists_url\": \"https://api.github.com/users/defunkt/gists{/gist_id}\",\n" +
            "        \"starred_url\": \"https://api.github.com/users/defunkt/starred{/owner}{/repo}\",\n" +
            "        \"subscriptions_url\": \"https://api.github.com/users/defunkt/subscriptions\",\n" +
            "        \"organizations_url\": \"https://api.github.com/users/defunkt/orgs\",\n" +
            "        \"repos_url\": \"https://api.github.com/users/defunkt/repos\",\n" +
            "        \"events_url\": \"https://api.github.com/users/defunkt/events{/privacy}\",\n" +
            "        \"received_events_url\": \"https://api.github.com/users/defunkt/received_events\",\n" +
            "        \"type\": \"User\",\n" +
            "        \"site_admin\": false\n" +
            "    },\n" +
            "    {\n" +
            "        \"login\": \"pjhyett\",\n" +
            "        \"id\": 3,\n" +
            "        \"node_id\": \"MDQ6VXNlcjM=\",\n" +
            "        \"avatar_url\": \"https://avatars.githubusercontent.com/u/3?v=4\",\n" +
            "        \"gravatar_id\": \"\",\n" +
            "        \"url\": \"https://api.github.com/users/pjhyett\",\n" +
            "        \"html_url\": \"https://github.com/pjhyett\",\n" +
            "        \"followers_url\": \"https://api.github.com/users/pjhyett/followers\",\n" +
            "        \"following_url\": \"https://api.github.com/users/pjhyett/following{/other_user}\",\n" +
            "        \"gists_url\": \"https://api.github.com/users/pjhyett/gists{/gist_id}\",\n" +
            "        \"starred_url\": \"https://api.github.com/users/pjhyett/starred{/owner}{/repo}\",\n" +
            "        \"subscriptions_url\": \"https://api.github.com/users/pjhyett/subscriptions\",\n" +
            "        \"organizations_url\": \"https://api.github.com/users/pjhyett/orgs\",\n" +
            "        \"repos_url\": \"https://api.github.com/users/pjhyett/repos\",\n" +
            "        \"events_url\": \"https://api.github.com/users/pjhyett/events{/privacy}\",\n" +
            "        \"received_events_url\": \"https://api.github.com/users/pjhyett/received_events\",\n" +
            "        \"type\": \"User\",\n" +
            "        \"site_admin\": false\n" +
            "    },\n" +
            "    {\n" +
            "        \"login\": \"wycats\",\n" +
            "        \"id\": 4,\n" +
            "        \"node_id\": \"MDQ6VXNlcjQ=\",\n" +
            "        \"avatar_url\": \"https://avatars.githubusercontent.com/u/4?v=4\",\n" +
            "        \"gravatar_id\": \"\",\n" +
            "        \"url\": \"https://api.github.com/users/wycats\",\n" +
            "        \"html_url\": \"https://github.com/wycats\",\n" +
            "        \"followers_url\": \"https://api.github.com/users/wycats/followers\",\n" +
            "        \"following_url\": \"https://api.github.com/users/wycats/following{/other_user}\",\n" +
            "        \"gists_url\": \"https://api.github.com/users/wycats/gists{/gist_id}\",\n" +
            "        \"starred_url\": \"https://api.github.com/users/wycats/starred{/owner}{/repo}\",\n" +
            "        \"subscriptions_url\": \"https://api.github.com/users/wycats/subscriptions\",\n" +
            "        \"organizations_url\": \"https://api.github.com/users/wycats/orgs\",\n" +
            "        \"repos_url\": \"https://api.github.com/users/wycats/repos\",\n" +
            "        \"events_url\": \"https://api.github.com/users/wycats/events{/privacy}\",\n" +
            "        \"received_events_url\": \"https://api.github.com/users/wycats/received_events\",\n" +
            "        \"type\": \"User\",\n" +
            "        \"site_admin\": false\n" +
            "    },\n" +
            "    {\n" +
            "        \"login\": \"ezmobius\",\n" +
            "        \"id\": 5,\n" +
            "        \"node_id\": \"MDQ6VXNlcjU=\",\n" +
            "        \"avatar_url\": \"https://avatars.githubusercontent.com/u/5?v=4\",\n" +
            "        \"gravatar_id\": \"\",\n" +
            "        \"url\": \"https://api.github.com/users/ezmobius\",\n" +
            "        \"html_url\": \"https://github.com/ezmobius\",\n" +
            "        \"followers_url\": \"https://api.github.com/users/ezmobius/followers\",\n" +
            "        \"following_url\": \"https://api.github.com/users/ezmobius/following{/other_user}\",\n" +
            "        \"gists_url\": \"https://api.github.com/users/ezmobius/gists{/gist_id}\",\n" +
            "        \"starred_url\": \"https://api.github.com/users/ezmobius/starred{/owner}{/repo}\",\n" +
            "        \"subscriptions_url\": \"https://api.github.com/users/ezmobius/subscriptions\",\n" +
            "        \"organizations_url\": \"https://api.github.com/users/ezmobius/orgs\",\n" +
            "        \"repos_url\": \"https://api.github.com/users/ezmobius/repos\",\n" +
            "        \"events_url\": \"https://api.github.com/users/ezmobius/events{/privacy}\",\n" +
            "        \"received_events_url\": \"https://api.github.com/users/ezmobius/received_events\",\n" +
            "        \"type\": \"User\",\n" +
            "        \"site_admin\": false\n" +
            "    },\n" +
            "    {\n" +
            "        \"login\": \"ivey\",\n" +
            "        \"id\": 6,\n" +
            "        \"node_id\": \"MDQ6VXNlcjY=\",\n" +
            "        \"avatar_url\": \"https://avatars.githubusercontent.com/u/6?v=4\",\n" +
            "        \"gravatar_id\": \"\",\n" +
            "        \"url\": \"https://api.github.com/users/ivey\",\n" +
            "        \"html_url\": \"https://github.com/ivey\",\n" +
            "        \"followers_url\": \"https://api.github.com/users/ivey/followers\",\n" +
            "        \"following_url\": \"https://api.github.com/users/ivey/following{/other_user}\",\n" +
            "        \"gists_url\": \"https://api.github.com/users/ivey/gists{/gist_id}\",\n" +
            "        \"starred_url\": \"https://api.github.com/users/ivey/starred{/owner}{/repo}\",\n" +
            "        \"subscriptions_url\": \"https://api.github.com/users/ivey/subscriptions\",\n" +
            "        \"organizations_url\": \"https://api.github.com/users/ivey/orgs\",\n" +
            "        \"repos_url\": \"https://api.github.com/users/ivey/repos\",\n" +
            "        \"events_url\": \"https://api.github.com/users/ivey/events{/privacy}\",\n" +
            "        \"received_events_url\": \"https://api.github.com/users/ivey/received_events\",\n" +
            "        \"type\": \"User\",\n" +
            "        \"site_admin\": false\n" +
            "    },\n" +
            "    {\n" +
            "        \"login\": \"evanphx\",\n" +
            "        \"id\": 7,\n" +
            "        \"node_id\": \"MDQ6VXNlcjc=\",\n" +
            "        \"avatar_url\": \"https://avatars.githubusercontent.com/u/7?v=4\",\n" +
            "        \"gravatar_id\": \"\",\n" +
            "        \"url\": \"https://api.github.com/users/evanphx\",\n" +
            "        \"html_url\": \"https://github.com/evanphx\",\n" +
            "        \"followers_url\": \"https://api.github.com/users/evanphx/followers\",\n" +
            "        \"following_url\": \"https://api.github.com/users/evanphx/following{/other_user}\",\n" +
            "        \"gists_url\": \"https://api.github.com/users/evanphx/gists{/gist_id}\",\n" +
            "        \"starred_url\": \"https://api.github.com/users/evanphx/starred{/owner}{/repo}\",\n" +
            "        \"subscriptions_url\": \"https://api.github.com/users/evanphx/subscriptions\",\n" +
            "        \"organizations_url\": \"https://api.github.com/users/evanphx/orgs\",\n" +
            "        \"repos_url\": \"https://api.github.com/users/evanphx/repos\",\n" +
            "        \"events_url\": \"https://api.github.com/users/evanphx/events{/privacy}\",\n" +
            "        \"received_events_url\": \"https://api.github.com/users/evanphx/received_events\",\n" +
            "        \"type\": \"User\",\n" +
            "        \"site_admin\": false\n" +
            "    },\n" +
            "    {\n" +
            "        \"login\": \"vanpelt\",\n" +
            "        \"id\": 17,\n" +
            "        \"node_id\": \"MDQ6VXNlcjE3\",\n" +
            "        \"avatar_url\": \"https://avatars.githubusercontent.com/u/17?v=4\",\n" +
            "        \"gravatar_id\": \"\",\n" +
            "        \"url\": \"https://api.github.com/users/vanpelt\",\n" +
            "        \"html_url\": \"https://github.com/vanpelt\",\n" +
            "        \"followers_url\": \"https://api.github.com/users/vanpelt/followers\",\n" +
            "        \"following_url\": \"https://api.github.com/users/vanpelt/following{/other_user}\",\n" +
            "        \"gists_url\": \"https://api.github.com/users/vanpelt/gists{/gist_id}\",\n" +
            "        \"starred_url\": \"https://api.github.com/users/vanpelt/starred{/owner}{/repo}\",\n" +
            "        \"subscriptions_url\": \"https://api.github.com/users/vanpelt/subscriptions\",\n" +
            "        \"organizations_url\": \"https://api.github.com/users/vanpelt/orgs\",\n" +
            "        \"repos_url\": \"https://api.github.com/users/vanpelt/repos\",\n" +
            "        \"events_url\": \"https://api.github.com/users/vanpelt/events{/privacy}\",\n" +
            "        \"received_events_url\": \"https://api.github.com/users/vanpelt/received_events\",\n" +
            "        \"type\": \"User\",\n" +
            "        \"site_admin\": false\n" +
            "    },\n" +
            "    {\n" +
            "        \"login\": \"wayneeseguin\",\n" +
            "        \"id\": 18,\n" +
            "        \"node_id\": \"MDQ6VXNlcjE4\",\n" +
            "        \"avatar_url\": \"https://avatars.githubusercontent.com/u/18?v=4\",\n" +
            "        \"gravatar_id\": \"\",\n" +
            "        \"url\": \"https://api.github.com/users/wayneeseguin\",\n" +
            "        \"html_url\": \"https://github.com/wayneeseguin\",\n" +
            "        \"followers_url\": \"https://api.github.com/users/wayneeseguin/followers\",\n" +
            "        \"following_url\": \"https://api.github.com/users/wayneeseguin/following{/other_user}\",\n" +
            "        \"gists_url\": \"https://api.github.com/users/wayneeseguin/gists{/gist_id}\",\n" +
            "        \"starred_url\": \"https://api.github.com/users/wayneeseguin/starred{/owner}{/repo}\",\n" +
            "        \"subscriptions_url\": \"https://api.github.com/users/wayneeseguin/subscriptions\",\n" +
            "        \"organizations_url\": \"https://api.github.com/users/wayneeseguin/orgs\",\n" +
            "        \"repos_url\": \"https://api.github.com/users/wayneeseguin/repos\",\n" +
            "        \"events_url\": \"https://api.github.com/users/wayneeseguin/events{/privacy}\",\n" +
            "        \"received_events_url\": \"https://api.github.com/users/wayneeseguin/received_events\",\n" +
            "        \"type\": \"User\",\n" +
            "        \"site_admin\": false\n" +
            "    },\n" +
            "    {\n" +
            "        \"login\": \"brynary\",\n" +
            "        \"id\": 19,\n" +
            "        \"node_id\": \"MDQ6VXNlcjE5\",\n" +
            "        \"avatar_url\": \"https://avatars.githubusercontent.com/u/19?v=4\",\n" +
            "        \"gravatar_id\": \"\",\n" +
            "        \"url\": \"https://api.github.com/users/brynary\",\n" +
            "        \"html_url\": \"https://github.com/brynary\",\n" +
            "        \"followers_url\": \"https://api.github.com/users/brynary/followers\",\n" +
            "        \"following_url\": \"https://api.github.com/users/brynary/following{/other_user}\",\n" +
            "        \"gists_url\": \"https://api.github.com/users/brynary/gists{/gist_id}\",\n" +
            "        \"starred_url\": \"https://api.github.com/users/brynary/starred{/owner}{/repo}\",\n" +
            "        \"subscriptions_url\": \"https://api.github.com/users/brynary/subscriptions\",\n" +
            "        \"organizations_url\": \"https://api.github.com/users/brynary/orgs\",\n" +
            "        \"repos_url\": \"https://api.github.com/users/brynary/repos\",\n" +
            "        \"events_url\": \"https://api.github.com/users/brynary/events{/privacy}\",\n" +
            "        \"received_events_url\": \"https://api.github.com/users/brynary/received_events\",\n" +
            "        \"type\": \"User\",\n" +
            "        \"site_admin\": false\n" +
            "    },\n" +
            "    {\n" +
            "        \"login\": \"kevinclark\",\n" +
            "        \"id\": 20,\n" +
            "        \"node_id\": \"MDQ6VXNlcjIw\",\n" +
            "        \"avatar_url\": \"https://avatars.githubusercontent.com/u/20?v=4\",\n" +
            "        \"gravatar_id\": \"\",\n" +
            "        \"url\": \"https://api.github.com/users/kevinclark\",\n" +
            "        \"html_url\": \"https://github.com/kevinclark\",\n" +
            "        \"followers_url\": \"https://api.github.com/users/kevinclark/followers\",\n" +
            "        \"following_url\": \"https://api.github.com/users/kevinclark/following{/other_user}\",\n" +
            "        \"gists_url\": \"https://api.github.com/users/kevinclark/gists{/gist_id}\",\n" +
            "        \"starred_url\": \"https://api.github.com/users/kevinclark/starred{/owner}{/repo}\",\n" +
            "        \"subscriptions_url\": \"https://api.github.com/users/kevinclark/subscriptions\",\n" +
            "        \"organizations_url\": \"https://api.github.com/users/kevinclark/orgs\",\n" +
            "        \"repos_url\": \"https://api.github.com/users/kevinclark/repos\",\n" +
            "        \"events_url\": \"https://api.github.com/users/kevinclark/events{/privacy}\",\n" +
            "        \"received_events_url\": \"https://api.github.com/users/kevinclark/received_events\",\n" +
            "        \"type\": \"User\",\n" +
            "        \"site_admin\": false\n" +
            "    },\n" +
            "    {\n" +
            "        \"login\": \"technoweenie\",\n" +
            "        \"id\": 21,\n" +
            "        \"node_id\": \"MDQ6VXNlcjIx\",\n" +
            "        \"avatar_url\": \"https://avatars.githubusercontent.com/u/21?v=4\",\n" +
            "        \"gravatar_id\": \"\",\n" +
            "        \"url\": \"https://api.github.com/users/technoweenie\",\n" +
            "        \"html_url\": \"https://github.com/technoweenie\",\n" +
            "        \"followers_url\": \"https://api.github.com/users/technoweenie/followers\",\n" +
            "        \"following_url\": \"https://api.github.com/users/technoweenie/following{/other_user}\",\n" +
            "        \"gists_url\": \"https://api.github.com/users/technoweenie/gists{/gist_id}\",\n" +
            "        \"starred_url\": \"https://api.github.com/users/technoweenie/starred{/owner}{/repo}\",\n" +
            "        \"subscriptions_url\": \"https://api.github.com/users/technoweenie/subscriptions\",\n" +
            "        \"organizations_url\": \"https://api.github.com/users/technoweenie/orgs\",\n" +
            "        \"repos_url\": \"https://api.github.com/users/technoweenie/repos\",\n" +
            "        \"events_url\": \"https://api.github.com/users/technoweenie/events{/privacy}\",\n" +
            "        \"received_events_url\": \"https://api.github.com/users/technoweenie/received_events\",\n" +
            "        \"type\": \"User\",\n" +
            "        \"site_admin\": false\n" +
            "    },\n" +
            "    {\n" +
            "        \"login\": \"macournoyer\",\n" +
            "        \"id\": 22,\n" +
            "        \"node_id\": \"MDQ6VXNlcjIy\",\n" +
            "        \"avatar_url\": \"https://avatars.githubusercontent.com/u/22?v=4\",\n" +
            "        \"gravatar_id\": \"\",\n" +
            "        \"url\": \"https://api.github.com/users/macournoyer\",\n" +
            "        \"html_url\": \"https://github.com/macournoyer\",\n" +
            "        \"followers_url\": \"https://api.github.com/users/macournoyer/followers\",\n" +
            "        \"following_url\": \"https://api.github.com/users/macournoyer/following{/other_user}\",\n" +
            "        \"gists_url\": \"https://api.github.com/users/macournoyer/gists{/gist_id}\",\n" +
            "        \"starred_url\": \"https://api.github.com/users/macournoyer/starred{/owner}{/repo}\",\n" +
            "        \"subscriptions_url\": \"https://api.github.com/users/macournoyer/subscriptions\",\n" +
            "        \"organizations_url\": \"https://api.github.com/users/macournoyer/orgs\",\n" +
            "        \"repos_url\": \"https://api.github.com/users/macournoyer/repos\",\n" +
            "        \"events_url\": \"https://api.github.com/users/macournoyer/events{/privacy}\",\n" +
            "        \"received_events_url\": \"https://api.github.com/users/macournoyer/received_events\",\n" +
            "        \"type\": \"User\",\n" +
            "        \"site_admin\": false\n" +
            "    }\n" +
            "]"

    fun getUserBasicInfo() = "    {\n" +
            "        \"login\": \"macournoyer\",\n" +
            "        \"id\": 22,\n" +
            "        \"node_id\": \"MDQ6VXNlcjIy\",\n" +
            "        \"avatar_url\": \"https://avatars.githubusercontent.com/u/22?v=4\",\n" +
            "        \"gravatar_id\": \"\",\n" +
            "        \"url\": \"https://api.github.com/users/macournoyer\",\n" +
            "        \"html_url\": \"https://github.com/macournoyer\",\n" +
            "        \"followers_url\": \"https://api.github.com/users/macournoyer/followers\",\n" +
            "        \"following_url\": \"https://api.github.com/users/macournoyer/following{/other_user}\",\n" +
            "        \"gists_url\": \"https://api.github.com/users/macournoyer/gists{/gist_id}\",\n" +
            "        \"starred_url\": \"https://api.github.com/users/macournoyer/starred{/owner}{/repo}\",\n" +
            "        \"subscriptions_url\": \"https://api.github.com/users/macournoyer/subscriptions\",\n" +
            "        \"organizations_url\": \"https://api.github.com/users/macournoyer/orgs\",\n" +
            "        \"repos_url\": \"https://api.github.com/users/macournoyer/repos\",\n" +
            "        \"events_url\": \"https://api.github.com/users/macournoyer/events{/privacy}\",\n" +
            "        \"received_events_url\": \"https://api.github.com/users/macournoyer/received_events\",\n" +
            "        \"type\": \"User\",\n" +
            "        \"site_admin\": false\n" +
            "    }\n"

    fun getUserProfileInfo() = "{\n" +
            "    \"login\": \"mojombo\",\n" +
            "    \"id\": 1,\n" +
            "    \"node_id\": \"MDQ6VXNlcjE=\",\n" +
            "    \"avatar_url\": \"https://avatars.githubusercontent.com/u/1?v=4\",\n" +
            "    \"gravatar_id\": \"\",\n" +
            "    \"url\": \"https://api.github.com/users/mojombo\",\n" +
            "    \"html_url\": \"https://github.com/mojombo\",\n" +
            "    \"followers_url\": \"https://api.github.com/users/mojombo/followers\",\n" +
            "    \"following_url\": \"https://api.github.com/users/mojombo/following{/other_user}\",\n" +
            "    \"gists_url\": \"https://api.github.com/users/mojombo/gists{/gist_id}\",\n" +
            "    \"starred_url\": \"https://api.github.com/users/mojombo/starred{/owner}{/repo}\",\n" +
            "    \"subscriptions_url\": \"https://api.github.com/users/mojombo/subscriptions\",\n" +
            "    \"organizations_url\": \"https://api.github.com/users/mojombo/orgs\",\n" +
            "    \"repos_url\": \"https://api.github.com/users/mojombo/repos\",\n" +
            "    \"events_url\": \"https://api.github.com/users/mojombo/events{/privacy}\",\n" +
            "    \"received_events_url\": \"https://api.github.com/users/mojombo/received_events\",\n" +
            "    \"type\": \"User\",\n" +
            "    \"site_admin\": false,\n" +
            "    \"name\": \"Tom Preston-Werner\",\n" +
            "    \"company\": \"@chatterbugapp, @redwoodjs, @preston-werner-ventures \",\n" +
            "    \"blog\": \"http://tom.preston-werner.com\",\n" +
            "    \"location\": \"San Francisco\",\n" +
            "    \"email\": null,\n" +
            "    \"hireable\": null,\n" +
            "    \"bio\": null,\n" +
            "    \"twitter_username\": \"mojombo\",\n" +
            "    \"public_repos\": 62,\n" +
            "    \"public_gists\": 62,\n" +
            "    \"followers\": 22607,\n" +
            "    \"following\": 11,\n" +
            "    \"created_at\": \"2007-10-20T05:24:19Z\",\n" +
            "    \"updated_at\": \"2021-06-10T20:43:31Z\"\n" +
            "}"

    fun getRemoteException() = RemoteException(getRemoteErrorString())

    fun getRemoteErrorString() = "{\n" +
            "    \"message\": \"API rate limit exceeded for 126.197.58.40. (But here's the good news: Authenticated requests get a higher rate limit. Check out the documentation for more details.)\",\n" +
            "    \"documentation_url\": \"https://docs.github.com/rest/overview/resources-in-the-rest-api#rate-limiting\"\n" +
            "}"

}