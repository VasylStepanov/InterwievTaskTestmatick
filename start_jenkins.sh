sudo docker-compose pull
sudo docker-compose up -d
sleep 1s
password=$(sudo docker exec testmatick_jenkins cat /var/jenkins_home/secrets/initialAdminPassword)
echo "Jenkins password: $password"
