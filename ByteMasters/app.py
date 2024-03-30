# from flask import Flask, session, request, render_template
# from mysql.connector import *

# app = Flask(__name__)

# conn = mysql.connector.connect(

# )
# cur = conn.cursor()

# app.route('/login')
# def login():
#     email = request.form['email']
#     password = request.form['password']

#     details = cur.execute("SELECT password FROM users WHERE email=?", email)

#     if details == password:
#         session['email'] = email
        
#     return (render_template("ïndex.html"))

# # welcome{{email}}