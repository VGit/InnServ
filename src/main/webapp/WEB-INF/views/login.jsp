			<form class="form with-margin" name="login-form" id="login-form" method="POST" action="<c:url value='j_spring_security_check'/>">
				<input type="hidden" name="a" id="a" value="send">
				<p class="inline-small-label">
					<label for="login"><span class="big">User name</span></label>
					<input type="text" name="j_username" id="j_username" maxlength="50" tabindex="5" value="B750G0">
				</p>
				<p class="inline-small-label">
					<label for="pass"><span class="big">Password</span></label>
					<input type="password" name="j_password" id="j_password" maxlength="50" tabindex="6" value="password">
				</p>
				
				<button type="submit" class="float-right">Login</button>
				
				<p class="input-height">
				<!--	<input type="checkbox" name="keep-logged" id="keep-logged" value="1" class="mini-switch" checked="checked">
					<label for="keep-logged" class="inline">Keep me logged in</label> -->
				</p>
				
			</form>